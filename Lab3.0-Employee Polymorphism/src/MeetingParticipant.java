// -------------------------------------------------------------------------
/**
 *  This interface represents an individual who can participate in meetings
 *  with other participants.
 *
 *  @author  Romeo Bahoumda
 *  @version 2017.02.10
 */
public interface MeetingParticipant
{

    // ----------------------------------------------------------
    /**
     * Gets the name of the meeting participant.
     * @return the name of the meeting participant
     */
    public String getName();


    // ----------------------------------------------------------
    /**
     * Returns a message to announce that this participant is joining the
     * given participant in a meeting.
     * @param otherParticipant theS other meeting participant
     * @return a message describing the nature of the meeting
     */
    public String meetWith(MeetingParticipant otherParticipant);
}
