Project: music-organizer-v4. A project to collect audio files.
Authors: David J. Barnes and Michael Kölling

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

It is discussed in chapter 4.

To start:

Create a MusicOrganizer object. This will scan the default audio 
folder for any mp3 files. The default folder is the one named
"audio", in the same directory as the project folder.

You can place your own mp3 files into this folder to include and 
play them. Just make sure the filename is of the expected format: 

  artist name-track name.mp3

q33. 
    boolean found = false;
    while(!found){
        if(the keys are in the next place){
            found = true;
        }
    }
q34.
    public void multiplesOfFive()
    {
          int n=10;
        while(n<=95){
            if(n%5=0){
                System.out.println(n);
            }
            ++n;
        }
    }
q35.
    int n=1
    while(n<=10){
        int sum=sum+n;
        ++n;
    }
    System.out.println(sum);
q36.
`   public void sum(int a, int b)
    {
        int n=a;
        while(n<=b){
            int sum=sum+n;
            ++n;
        }
        System.out.println(sum);
    }
q37.
    public boolean isPrime(int n)
    {
        int divider=2;
        boolean prime = true;
        while(divider<n){
            if(n%divider=0){
                prime=false;
                divider=n;
            }
            else{
                prime=true;
                ++divider;
            }
        }
        return prime;
    }