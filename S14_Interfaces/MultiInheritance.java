class MultiInheritance
{
    public static void main(String[] args)
    {
        Smartphone s = new Smartphone();
        Phone p = s;
        Camera c = s;
        MusicPlayer m = s;

        p.call();
        p.sms();
    }
}

class Smartphone extends Phone implements Camera, MusicPlayer
{
    public void click(){System.out.println("Clicked");}
    public void record(){System.out.println("Recording");}
    public void play(){System.out.println("Music playing");}
    public void pause(){System.out.println("Music paused");}
}

class Phone
{
    void call()
    {
        System.out.println("Calling");
    }
    void sms()
    {
        System.out.println("Messaging");
    }
}

interface Camera
{
    void click();
    void record();
}

interface MusicPlayer
{
    void play();
    void pause();
}