class displayoverload
{
    public void disp(char c)
    {
        System.out.println(c);
    }
    public void disp(char c, int num)
    {
        System.out.println(c + " " +num);
    }
    public void disp(int num, char c)
    {
        System.out.println(num + " " +c);
    }
    public void disp(int num, int num2)
    {
        System.out.println(num + " " +num);
    }
    public void disp(char c1, char c)
    {
        System.out.println(c1 + " " +c);
    }
}

