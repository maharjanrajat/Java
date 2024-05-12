class Sample
{
    public static void main(String args[])
    {
        displayoverload obj = new displayoverload();
        obj.disp('a');
        obj.disp('a',10);
        obj.disp(10,'a');
        obj.disp(10,10);
        obj.disp('a','b');
    }
}

