/**
 * Keeps track of if a song is playing or not
 * q32
 */
public class PlayStatus
{
    // instance variables - replace the example below with your own
    private boolean playing;

    /**
     * Constructor for objects of class PlayStatus
     */
    public PlayStatus()
    {
        playing = false;
    }

    public void setStatusTrue()
    {
        playing = true;
    }
    
    public void setStatusFalse()
    {
        playing = false;
    }
    
    public boolean checkStatus()
    {
        return playing;
    }
}
