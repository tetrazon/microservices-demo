package microservices.book.multiplication.challenge;

import microservices.book.multiplication.user.User;

import java.util.List;

public interface ChallengeService {
    /**
     * Verifies if an attempt coming from the presentation layer is correct or not.
     *
     * @return the resulting ChallengeAttempt object
     */
    ChallengeAttempt verifyAttempt(ChallengeAttemptDTO challengeAttempt);
    //List<ChallengeAttempt> lastAttempts(User user);
    List<ChallengeAttempt> getStatsForUser(String userAlias);
}
