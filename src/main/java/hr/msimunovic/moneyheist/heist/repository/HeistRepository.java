package hr.msimunovic.moneyheist.heist.repository;

import hr.msimunovic.moneyheist.common.enums.HeistStatusEnum;
import hr.msimunovic.moneyheist.heist.Heist;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HeistRepository extends JpaRepository<Heist, Long> {

    Heist findByName(String name);

    Heist findByNameIgnoreCase(String name);

    @Override
    @EntityGraph(attributePaths = { "members.member", "skills.skill" })
    Optional<Heist> findById(Long aLong);

    List<Heist> findByStatusOrStatus(HeistStatusEnum status1, HeistStatusEnum status2);

}
