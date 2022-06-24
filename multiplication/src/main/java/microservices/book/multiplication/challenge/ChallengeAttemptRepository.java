package microservices.book.multiplication.challenge;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChallengeAttemptRepository extends CrudRepository<ChallengeAttempt, Long> {
    /**
     * return last 10 attempts for a given user
     */
    List<ChallengeAttempt> findTop10ByUserAliasOrderByIdDesc(String userAlias);

    /**
     * @return the last attempts for a given user, identified by their alias.
     */
    @Query("SELECT a FROM ChallengeAttempt a WHERE a.user.alias = ?1 ORDER BY a.id DESC")
    List<ChallengeAttempt> lastAttempts(String userAlias);
}
