package hr.msimunovic.moneyheist.validator;

import hr.msimunovic.moneyheist.member.dto.MemberSkillDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MemberSkillValidator implements ConstraintValidator<MemberSkill, MemberSkillDTO> {

    @Override
    public boolean isValid(MemberSkillDTO value, ConstraintValidatorContext context) {

        if(value.getSkills().isEmpty() && value.getMainSkill().isEmpty()) {
            return false;
        }

        return true;
    }

}
