package microservices.book.gamification.game.badgeprocessors;

import microservices.book.gamification.challenge.ChallengeSolvedDTO;
import microservices.book.gamification.game.domain.BadgeType;
import microservices.book.gamification.game.domain.ScoreCard;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
class LuckyNumberBadgeProcessor implements BadgeProcessor {
    @Override
    public Optional<BadgeType> processForOptionalBadge(
            int currentScore,
            List<ScoreCard> scoreCardList,
            ChallengeSolvedDTO solved) {
            return scoreCardList.size() == 42
                    || solved.getFactorB() == 42 || solved.getFactorA() == 42?
                Optional.of(BadgeType.LUCKY_NUMBER) : Optional.empty();
    }
    @Override
    public BadgeType badgeType() {
        return BadgeType.LUCKY_NUMBER;
    }
}
