


public class Entry {
private String last;
private String middle;
private String first;
private String street;
private String city;
private String state;
private String zip;
private String area;
private String exchange;
private String digits;

public Entry(String last,String middle,String first,String street,String city,String state,String zip,
		     String area,String exchange,String digits)
{
    this.last=last;
    this.middle=middle;
    this.first=first;
    this.street=street;
    this.city=city;
    this.state=state;
    this.zip=zip;
    this.area=area;
    this.exchange=exchange;
    this.digits=digits;
}

public String toString()
{
    return(""+last+" "+middle+" "+first+"\n"+street+" "+city+" "+state+" "+zip+"\n"+area+" "+exchange+" "+digits);
}

public String getLast()
{
    return last;
}

public String getZip()
{
	return zip;
}

public String getArea()
{
    return area;
}

}


