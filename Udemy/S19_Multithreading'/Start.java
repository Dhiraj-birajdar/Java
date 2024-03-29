class MyThread extends Thread
{
    public void run()
    {
        int i = 0;
        while(true)
        {
            System.out.println((i++)+" Hello");
        }
    }
}

class Start
{
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		int i = 0;
        while(true)
        {
            System.out.println((i++)+" World");
        }
	}
}

//or
// class Start extends Thread
// {
//     public void run()
//     {
//         int i = 0;
//         while(true)
//         {
//             System.out.println((i++)+" Hello");
//         }
//     }
// 	public static void main(String[] args) {
// 		Start mt = new Start();
// 		mt.start();
		
// 		int i = 0;
//         while(true)
//         {
//             System.out.println((i++)+" World");
//         }
// 	}
// }