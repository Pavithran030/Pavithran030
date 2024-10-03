int mySqrt(int x) {
    if(x<2)
        return x;
    double a=x;
    double b=(a+(x/a))/2;

    while(fabs(a-b)>=0.00001)
    {
        a=b;
        b=(a+(x/a))/2;
    }
    return b;
}
