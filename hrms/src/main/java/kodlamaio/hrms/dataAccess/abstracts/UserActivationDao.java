package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.UserActivation;

public interface UserActivationDao extends JpaRepository<UserActivation,Integer> {

}
