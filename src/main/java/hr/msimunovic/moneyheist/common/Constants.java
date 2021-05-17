package hr.msimunovic.moneyheist.common;

public class Constants {

    public static final String DEFAULT_SKILL_LEVEL = "*";

    // Http Constants
    public static final String HTTP_HEADER_LOCATION = "Location";
    public static final String HTTP_HEADER_CONTENT_LOCATION = "Content-Location";


    // Error Messages
    public static final String MSG_MEMBER_NOT_FOUND = "Member not found";
    public static final String MSG_HEIST_NOT_FOUND = "Heist not found";
    public static final String MSG_SKILL_NOT_FOUND = "Skill not found";

    public static final String MSG_MEMBER_EXISTS = "Member exists.";
    public static final String MSG_HEIST_EXISTS = "Heist exists.";

    public static final String MSG_MEMBER_STATUS_NOT_MATCH_TO_HEIST = "Member status must be AVAILABLE or RETIRED.";
    public static final String MSG_HEIST_STATUS_MUST_BE_PLANNING = "Heist status must be PLANNING.";
    public static final String MSG_HEIST_STATUS_MUST_NOT_BE_PLANNING = "Heist status must not be PLANNING.";
    public static final String MSG_HEIST_STATUS_MUST_BE_READY = "Heist status must be READY.";
    public static final String MSG_HEIST_STATUS_MUST_BE_FINISHED = "Heist status must be FINISHED.";

    public static final String MSG_INCORRECT_DATE_TIME = "Start or date time is incorrect.";
    public static final String MSG_MEMBERS_CONFIRMED = "Members have already been confirmed to another heist.";


    // Email Subjects and Messages
    public static final String MAIL_MEMBER_ADDED_SUBJECT = "New member";
    public static final String MAIL_MEMBER_ADDED_TEXT = "You are added as member.";

    public static final String MAIL_HEIST_PARTICIPANT_SUBJECT = "Heist participant";
    public static final String MAIL_HEIST_PARTICIPANT_TEXT = "You are confirmed to participate in a heist.";

    public static final String MAIL_HEIST_START_SUBJECT = "Heist started";
    public static final String MAIL_HEIST_START_TEXT = "Heist started right now.";

    public static final String MAIL_HEIST_FINISH_SUBJECT = "Heist finished";
    public static final String MAIL_HEIST_FINISH_TEXT = "Heist finished right now.";
}
