public class Horse
{ public String name, color;
  public int year;
  
  public String getName()
  { return name; }
  public String getColor()
  { return color; }
  public int getYear()
  { return year; }
  
  public void setName(String nm)
  { name = nm; }
  public void setColor(String cl)
  { color = cl; }
  public void setYear(int yr)
  { year = yr; }
  
  public String toString()
  { return name+"\t"+color+"\t"+year; }
}   
  