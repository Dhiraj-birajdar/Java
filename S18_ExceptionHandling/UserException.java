class UnderAgeException extends Exception{
    public String toString()
    {
        return "UnderAgeException: Age less than 18";
    }
}
class UserException {
    public static void main(String[] args) {
        int age = 3;
        try{
            if(age < 18)
                throw new UnderAgeException();
        }
        catch(UnderAgeException e)
        {
            System.out.println(e);
        }

    }
}