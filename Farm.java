class Farm 
{     
  private Animal [] aBunchOfAnimals = new Animal[3];
  public Farm()
  {
    aBunchOfAnimals[0]=new NamedCow("Cow","Lambo","moo");
    aBunchOfAnimals[1]=new Chick("Chick","piyo","mama");
    aBunchOfAnimals[2]=new Pig("Pig","oink");

  }
  public void animalSounds()
  {
  	for(int nI=0;nI<aBunchOfAnimals.length;nI++)
  	{
  	System.out.println(aBunchOfAnimals[nI].getType()+" goes "+aBunchOfAnimals[nI].getSound());
    }
    System.out.println("The cow is known as "+((NamedCow)aBunchOfAnimals[0]).getName());
  }
}
