package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.Dtos.CvDto;
import kodlamaio.hrms.entities.concretes.Cv;




public interface CvDao extends JpaRepository<Cv, Integer> {

	@Query("Select new kodlamaio.hrms.entities.Dtos.CvDto"
			+"(c.id,e.university,e.department,e.startingYearOfUniversity,"
			+"e.graduationYearOfUniversity,w.jobExperience,w.experienceStartingDate,"
			+"w.experienceEndDate,l.language,l.level,p.githubLink,p.linkedInLink,"
			+"cl.coverLetter)"
			+" From Cv c"
			+" Inner Join c.coverLetters cl"
			+" Inner Join c.profileLinks p"
			+" Inner Join c.educations e"
			+" Inner Join c.workExperiences w"
			+" Inner Join c.languages l"
			
			)
	List<CvDto> getCurriculumVitaeDetails();
	
}
