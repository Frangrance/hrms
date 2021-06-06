package kk.hrms.entities.dto;

import java.util.List;

import kk.hrms.entities.concretes.Ability;
import kk.hrms.entities.concretes.CoverLetter;
import kk.hrms.entities.concretes.Education;
import kk.hrms.entities.concretes.Experience;
import kk.hrms.entities.concretes.Image;
import kk.hrms.entities.concretes.JobHunter;
import kk.hrms.entities.concretes.Language;
import kk.hrms.entities.concretes.Link;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvDto {
	
	private JobHunter jobhunter;
	private Image image;
	private List<CoverLetter> coverletters;
	private List<Education> educations;
	private List<Experience> experiences;
	private List<Ability>	abilities;
	private List<Language> languages;
	private List<Link> links;
	
}
