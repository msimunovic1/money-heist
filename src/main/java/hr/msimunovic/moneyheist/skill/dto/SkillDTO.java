package hr.msimunovic.moneyheist.skill.dto;

import lombok.Data;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Data Transformation Object for work with API-s that request or response general Skill data.
 */
@Data
public class SkillDTO {

    private String name;

    @Pattern(regexp = "[\\*]*", message = "Skill level should be made of asterisk characters")
    @Size(min = 1, max = 10, message = "Skill level must be from 1* to 10*")
    private String level;

}
