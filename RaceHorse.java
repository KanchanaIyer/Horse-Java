public class RaceHorse extends Horse
{ public String races;

  public String getRaces()
  { return races; }
  
  public void setRaces(String rcs)
  { races = rcs; }
  
  public String toString()
  { return super.toString()+"\t"+races; }
}