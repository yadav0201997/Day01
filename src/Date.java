public class Date {
	private int day = 1;
	private int month = 1;
	private int year = 2023;

	public void display() {
		System.out.printf("/d:/d:/d", day, month, year);
	}
	public boolean isLeap(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			return true;
		else
			return false;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public int addDay(int number) {
		int day=getDay()+number;
		if(day>31 &&(getMonth()==1||getMonth()==3||getMonth()==5||getMonth()==7||getMonth()==8||getMonth()==10||getMonth()==12))
		{monthChange(getMonth());
			return day-31;}
		else if(day>30 &&(getMonth()==4||getMonth()==6||getMonth()==9||getMonth()==11)) {
			monthChange(getMonth());
			return day-30;
		}
		else if (day>29 && isLeap(getYear()) && getMonth()==2)
		{monthChange(getMonth());
			return day-29;
		}
		else if (day>28 && isLeap(getYear())==false && getMonth()==2)
		{monthChange(getMonth());
			return day-28;
		}
		else 
			return getDay() + number;
	}
	public void monthChange(int month)
	{
		this.month= getMonth()+1;
	}
	public void yearChange(int year)
	{
		this.year= getYear()+1;
	}
	
	public int addMonth(int number) {
		int month= getMonth() + number;
		if(month>12)
			{yearChange(getYear());
			return month-12;		
			}
		else
			return month;
	}
	public int addYear(int number) {
		return getYear() + number;
	}
	public void setDate(int tempDay, int tempMonth, int tempYear) {
		if (tempYear < 1900 || tempYear > 3000)
			year = 2023;
		else
			this.year = tempYear;
		if (tempMonth < 1 || tempMonth > 12)
			this.month = 1;
		else
			this.month = tempMonth;
		
		if (tempMonth == 1 || tempMonth == 3 || tempMonth == 5 || tempMonth == 7 || tempMonth == 8 || tempMonth == 10
				|| tempMonth == 12) {
			if (day < 1 || day > 31)
				this.day = 1;
			else
				this.day = tempDay;
		}
		if (tempMonth == 4 || tempMonth == 6 || tempMonth == 9 || tempMonth == 11) {
			if (day < 1 || day > 30)
				this.day = 1;
			else
				this.day = tempDay;
		}
		
			if (isLeap(tempYear) && tempMonth==2 ) 
			{
				if (tempDay >= 1 && tempDay <= 29)
					this.day = tempDay;
				else
					this.day = 1;
			}
			 if (isLeap(tempYear)==false && tempMonth==2)
			{
				if (tempDay >= 1 && tempDay <= 28)
					this.day = tempDay;
				else
					this.day = 1;
			}
		}
	
}



