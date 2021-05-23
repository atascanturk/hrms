package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.UserType;

public interface UserTypeDao extends JpaRepository<UserType,Integer> {

}
