class NamedCow extends Cow
{
  private String myName;
  public NamedCow(String getType,String name,String getSound)
  {
    myName = name;
    myType= getType;
    mySound = getSound;
  }
  public NamedCow()
  {
    myName = "unknown";
  }
  public String getName(){return myName;}

}