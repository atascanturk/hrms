package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.UserActivationsByAdmin;

public interface UserActivationByAdminDao extends JpaRepository<UserActivationsByAdmin,Integer> {

}
