/*
package microservices.book.gamification.game;

import microservices.book.gamification.challenge.ChallengeSolvedDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.BDDAssertions.then;

class GameServiceTest {
    private GameService gameService;

    @BeforeEach
    public void setUp(){
        gameService = new GameServiceImpl();
    }

    @Test
    void correctAttemptTest() {
        // given
        ChallengeSolvedDTO challenge =
                new ChallengeSolvedDTO(1, false,11, 12, 1, "test");
        GameService.GameResult gameResult = new GameService.GameResult(132, null);
        BDDMockito.given(gameService.newAttemptForUser(challenge)).willReturn(gameResult);

        // when
        GameService.GameResult actualGameResult = gameService.newAttemptForUser(challenge);

        //then
        BDDAssertions.then(actualGameResult).isEqualTo(gameResult);
    }
}*/
