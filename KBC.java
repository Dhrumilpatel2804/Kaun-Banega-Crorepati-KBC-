import java.util.*;
class KBC{
	public static void main(String args[]){
		A1 ob=new A1();
		ob.intro();
		System.out.println("-------------------------------------------------------------\nSo Let's Start KBC \n");
		for(int i=1;i<=17;i++){
		ob.askque();
		ob.answer();
		if(ob.q){break;}
		}
		ob.greeting();
	}
}
class A1{
Scanner sc=new Scanner(System.in);
	int reward,op=0,count;
	int rndmnum[]=new int[17];
	String s,que,a,b,c,d,ans,name;
	boolean cl1=true,cl2=true,cl3=true,cl4=true,q=false;
	
	void intro(){
		System.out.println("Hello Welcome To KBC\n");
		System.out.println("What Is Your Name?");
		name=sc.nextLine();
		System.out.println("\nSo "+name+" Before Start The Game\nI can Explain You Rulles Of The Game");
		System.out.println("\n1.Audience Poll     2.Ask To Expert\n3.Double Dip        4.Phone A Friend");
		System.out.println("\nQue No.     Reward");
		System.out.println("17         7,00,00,000");
		System.out.println("16         3,00,00,000");
		System.out.println("15         1,00,00,000");
		System.out.println("14         50,00,000");
		System.out.println("13         25,00,000");
		System.out.println("12         12,80,000");
		System.out.println("11         6,40,000");
		System.out.println("10         3,20,000");
		System.out.println("9          1,60,000");
		System.out.println("8          80,000");
		System.out.println("7          40,000");
		System.out.println("6          20,000");
		System.out.println("5          10,000");
		System.out.println("4          5,000");
		System.out.println("3          3,000");
		System.out.println("2          2,000");
		System.out.println("1          1,000");
		System.out.println("\n\nIn The Game Total 17 Questions\nEach Question Have Different Rewards");
		System.out.println("You Have Also Four Life Lines\n");
        System.out.println("for answer Enter ans");
        System.out.println("for Life Line Enter Life Line");
        System.out.println("for exit Enter quit");
	}
	
	void answer(){
		System.out.print("\nWhat Do You Want To Do ?");
		s=sc.nextLine();
		String s1;
		if(s.equalsIgnoreCase("Ans")){
			System.out.print("Select Option : ");
			s1=sc.nextLine();
			if(s1.equalsIgnoreCase(ans)){
			setrew();
			System.out.println("you are correct");
			System.out.println("YOU WIN = "+reward);
			}
			else{
			System.out.println("Sorry, You are incorrect.");
			System.out.println("correct answer is : "+ans);
			q=true;
			}
		}
		else if(s.equalsIgnoreCase("Quit")){
			q=true;
		}
		else if(s.equalsIgnoreCase("Life Line")){
			lifeLine();
		}
		else{
			System.out.println("SORRY ERROR");
			answer();
			}
	}
	
	void lifeLine(){
		String s2,s3;
		if(cl1||cl2||cl3||cl4){
				System.out.println("Available Life Line : ");
				if(cl1){System.out.println("Ask To Expert");}
				if(cl2){System.out.println("Double Dip");}
				if(cl3){System.out.println("Audience Poll");}
				if(cl4){System.out.println("Phone A Friend");}
			}
		else{
			System.out.println("Sorry No life line Available");
			answer();
			}
			System.out.println("Which life Line You Want to Use?");
			s2=sc.nextLine();
			if(s2.equalsIgnoreCase("Ask To Expert")&&cl1){
				System.out.println("I think Write Answer Is : "+ans);
				cl1=false;
				answer();
			}
			else if(s2.equalsIgnoreCase("Double dip")&&cl2){
				setrew();
				System.out.println("chosse any two of four : ");	
				System.out.print("Select option : ");
				s3=sc.nextLine();
				if(s3.equalsIgnoreCase(ans)){
					System.out.println("you are correct");
					System.out.println("YOU WIN = "+reward);	
				}
				else{
					System.out.println("Sorry you are incorrect,\n But you have also one chance");
					System.out.print("Select Second option : ");
					s3=sc.nextLine();
						if(s3.equalsIgnoreCase(ans)){
						System.out.println("you are correct");
						System.out.println("YOU WIN = "+reward);
						}
						else{
						System.out.println("Sorry, You are incorrect.");
						System.out.println("correct answer is : "+ans);
						q=true;
						}
					}
				cl2=false;
			}
			else if(s2.equalsIgnoreCase("Audience Poll")&&cl3){
				if(ans=="a"){
					System.out.print("\nA : ");loo(6);
					System.out.print("60%\nB : ");loo(2);
					System.out.print("20%\nC : ");loo(1);
					System.out.print("10%\nD : ");loo(1);
					System.out.println("10%");
				}
				if(ans=="b"){
					System.out.print("\nA : ");loo(2);
					System.out.print("20%\nB : ");loo(5);
					System.out.print("50%\nC : ");loo(1);
					System.out.print("10%\nD : ");loo(2);
					System.out.print("20%");
				}
				if(ans=="c"){
					System.out.print("\nA : ");loo(1);
					System.out.print("10%\nB : ");loo(1);
					System.out.print("10%\nC : ");loo(7);
					System.out.print("70%\nD : ");loo(1);
					System.out.println("10%");
				}
				if(ans=="d"){
					System.out.print("\nA : ");loo(3);
					System.out.print("30%\nB : ");loo(2);
					System.out.print("20%\nC : ");loo(1);
					System.out.print("10%\nD : ");loo(4);
					System.out.println("40%");
				}
				cl3=false;
			answer();
			}
			else if(s2.equalsIgnoreCase("Phone A friend")&&cl4){
				int fr=(int)(Math.random()*100);
				if(fr<50){
					System.out.println("correct answer is "+ans);
				}
				else if(fr<=90&&fr>=50){
				System.out.println("correct answer is "+b);
				}
				else{
					System.out.println("I am not sure");
				}
				cl4=false;
			answer();
			}
			else{
				System.out.println("Sorry No life line available");
			}
		}
	void loo(int i){
		for(int j=1;j<=i;j++){System.out.print("[]");}
	}
	void setrew(){
		switch(op){
			case 1:reward=1000;break;
			case 2:reward=2000;break;
			case 3:reward=3000;break;
			case 4:reward=5000;break;
			case 5:reward=10000;break;
			case 6:reward=20000;break;
			case 7:reward=40000;break;
			case 8:reward=80000;break;
			case 9:reward=160000;break;
			case 10:reward=320000;break;
			case 11:reward=640000;break;
			case 12:reward=1280000;break;
			case 13:reward=2500000;break;
			case 14:reward=5000000;break;
			case 15:reward=10000000;break;
			case 16:reward=30000000;break;
			case 17:reward=70000000;break;
		}
	}
	void greeting(){
		int fr;
		if(s.equalsIgnoreCase("Quit")){
			fr=reward;
			System.out.println("Congrats For Win "+fr);
			System.out.println("I Wish It is Help Full For You.");
			}
		else{
			if(reward<10000){
				fr=0;
				}
			else if(reward<320000){
				fr=10000;
				}
			else if(reward<70000000){
				fr=320000;
				}
			else{
				fr=70000000;	
			}
			System.out.println("Congrats For Win "+fr);
		    System.out.println("I Wish It is Help Full For You.");
		}	
	}
	
	void askque(){
		int j=0;
		boolean b1=true;
		int i=(int)(Math.random()*70);
		for(int k=0;k<17;k++){
		if(rndmnum[k]==i||i==0){
				b1=false;					
			}
		}
		if(b1&&count<17){
			j=i;
			rndmnum[count]=i;
			count++;
			}
		if(!b1){askque();}
		op++;
		switch(j){
		case 1:que="Which of the following is an example of impact of the development activities on hydrosphere? ";
		a="Air pollution" ;b="Soil pollution";c="Noise pollution";d="water pollution";ans="d";break;
		case 2:que="The study of flower is known as";
		a="Phrenology" ;b="Anthology";c="Agrostology";d="Palynology";ans="b";break;
		case 3:que="The ph value of human blood is";
		a="6.6" ;b="7.2";c="7.4";d="7.8";ans="c";break;
		case 4:que="Hemoglobin is a";
		a="Protein" ;b="Carbohydrate";c="Fat";d="Vitamins";ans="a";break;
		case 5:que="The vitamin that is most rapidly manufactured in our body is";
		a="Vitamin A" ;b="Vitamin B";c="Vitamin C";d="Vitamin D";ans="d";break;
		case 6:que="Accumulation of which one of the following in our muscle lead to faitage";
		a="Lactic Acid" ;b="Pyruvic Acid";c="Beenzoic Acid";d="Uric Acid";ans="a";break;
		case 7:que="The escape velocity of the Earth is";
		a="7.0 km/sec" ;b="11.2 km/sec";c="15.0 km/sec";d="21.1 km/sec";ans="b";break;
		case 8:que="Whitch one of the following method is used to seprate water from alcohol water mixture";
		a="Decantation" ;b="Evaporation";c="Sublimation";d="Distillation";ans="d";break;
		case 9:que="The number of chambers in human heart is";
		a="3" ;b="4";c="5";d="6";ans="b";break;
		case 10:que="Which one of the following metal is used with iron to make it rust free";
		a="Alluminium" ;b="Carbon";c="Chromium";d="Tin";ans="c";break;
		case 11:que="Athlete's foot is a disease caused by";
		a="Bacteria" ;b="Fungus";c="Protozoan";d="Nematode";ans="b";break;
		case 12:que="In eye donation which part of the donor's eye is utilised";
		a="Iris" ;b="Retina";c="Lens";d="Cornea";ans="d";break;
		case 13:que="The major component of Honey is";
		a="Glucose" ;b="Maltose";c="Fructose";d="Sucrose";ans="c";break;
		case 14:que="The velocity of sound is minimum in";
		a="Vacuum" ;b="Water";c="Air";d="Iron";ans="a";break;
		case 15:que="How many bones are present in human ears";
		a="4" ;b="5";c="6";d="9";ans="c";break;
		case 16:que="A satellite is kept moving in its orbit around the Earth due to its";
		a="Centrifugal Force" ;b="Centripetal Force";c="Gravitational Force";d="None of the Above";ans="b";break;
		case 17:que="In case of rusting ,the weight of Iron will be";
		a="Increase" ;b="Decrease";c="Remains Same";d="Uncertain";ans="a";break;
		case 18:que="Melbomian gland is located in";
		a="Ear" ;b="Nose";c="Skin";d="Eye";ans="d";break;
		case 19:que="Which one of the following gas is known as Noble Gas";
		a="Hydrogen" ;b="Oxygen";c="Helium";d="Carbon Dioxide";ans="c";break;
		case 20:que="Which of the following devices is used for converting Alternative Current into Direct Current";
		a="Dynamo" ;b="Motor";c="Transformer";d="Rectifier";ans="d";break;
		case 21:que="Octane number is used for measuring the quality of";
		a="Edible Oil" ;b="Petrol";c="Kerosene Oil";d="Perfumed Oil";ans="b";break;
		case 22:que="In Automobiles, Hydraulic Brake is works on";
		a="Pascal's Law" ;b="Archimedes Principal";c="Newton's Law of Motion";d="Bernoulli's Principle";ans="a";break;
		case 23:que="Lack of which of the following substance in our body causes Diabetes";
		a="Insulin" ;b="Hemoglobin";c="Histamin";d="Glycine";ans="a";break;
		case 24:que="One Barrel of oil is equal to which one of the following";
		a="131 Litre" ;b="159 Litre";c="179 Litre";d="201 Litre";ans="b";break;
		case 25:que="Which of the following determines the loudness or softness of the sound";
		a="Oscillation" ;b="Frequency";c="Amplitude";d="Wave Velocity";ans="c";break;
		case 26:que="In the Atmosphere ultraviolet rays are observad by";
		a="Oxygen" ;b="Nitrogen";c="Ozone";d="Hellium";ans="c";break;
		case 27:que="Who is known as father of Immunology";
		a="Louis Pasteur" ;b="Robert Koch";c="Landsteiner";d="Edward jenner";ans="d";break;
		case 28:que="Which one of the following metal is called the Metal of Future";
		a="Copper" ;b="Iron";c="Aluminium";d="Titanium";ans="d";break;
		case 29:que="When water is heated from 0C to 10C. Its volume";
		a="Increases" ;b="Decreases";c="Doesn't Change";d="First Decreases than Increases";ans="d";break;
		case 30:que="In how many pieces were Einstein's brain cut?";
		a="204" ;b="240";c="212";d="200";ans="b";break;
		case 31:que="The chemical composition of cement is";
		a="Limestone, Clay and Gypsum" ;b="Limestone and Clay";c="Limestone and Gypsum";d="Clay and Gypsum";ans="a";break;
		case 32:que="__ constitute the core of the Earth";
		a="Iron and Nickel" ;b="Nitrogen and Oxygen";c="Silver and Gold";d="Oxygen and Hydrogen";ans="a";break;
		case 33:que="Name the heaviest matel found in Earth";
		a="Gold" ;b="Osmium";c="Platinum";d="Sodium";ans="b";break;
		case 34:que="First computer virus is known as";
		a="Rabbit" ;b="Creeper virus";c="Elk virus";d="SCA virus";ans="b";break;
		case 35:que="What is the most used keyboard layout?";
		a="AZERTY" ;b="QWERTY";c="QWERTZ";d="None of the Above";ans="b";break;
		case 36:que="What was New York called until 1664?";
		a="New Hampshire" ;b="New Zealand";c="New Amsterdam";d="New Mexico";ans="c";break;
		case 37:que="The popular game Snakes and Ladders originated in Which country";
		a="China" ;b="India";c="Brazil";d="U.K.";ans="b";break;
		case 38:que="Which was the first country to mine diamonds";
		a="India" ;b="Russia";c="U.K.";d="South Africa";ans="a";break;
		case 39:que="The Firefox logo is related to which animal?";
		a="Fox" ;b="Tiger";c="Red Panda";d="Leopard";ans="c";break;
		case 40:que="Which CEO suffers from colorblindness?";
		a="Sundar Pichai" ;b="Mark Zukerberg";c="Elon Mask";d="Warren Buffett";ans="b";break;
		case 41:que="Which one of the following scientist discovered polio vaccine";
		a="Alexender Flemming" ;b="Robert Koach";c="Edward Genere";d="Jones Salk";ans="d";break;
		case 42:que="Bauxite is the ore of";
		a="Alluminium" ;b="Iron";c="Copper";d="Gold";ans="a";break;
		case 43:que="The color of liquified Oxygen is";
		a="Pure White" ;b="Dark Blue";c="Green";d="Pale Blue";ans="d";break;
		case 44:que= "Which one of the following is the largest glacier of India? ";
		a= "Pindari " ;b= "Siachen";c= "Zemu ";d= "Gangotri";ans="b";break;
		case 45:que=" The name Marusthali is given to ";
		a="Meghalaya plateau" ;b="Karnataka plateau";c=" Deccan trap ";d=" Thar desert ";ans="d";break;
		case 46:que="  Loktak lake is located in the State of  ";
		a=" Arunachal Pradesh  " ;b="Manipur ";c="Jammu and Kashmir ";d=" Himachal Pradesh";ans="b";break;
		case 47:que=" The Himalayas are, ";
		a=" Volcanic mountains " ;b=" Block mountain ";c=" Young fold mountains ";d="Residual mountains ";ans="c";break;
		case 48:que=" Which one of the following is the capital of two states of India ";
		a="Kavaratti " ;b="Chandigarh ";c="Thiruvananthapuram ";d="Itanagar ";ans="b";break;
		case 49:que="When did Sikkim become part of India ? ";
		a="1982" ;b="1990";c="1975";d="1976";ans="c";break;
		case 50:que=" Largest delta in the world is ";
		a=" Irrawaddy Delta " ;b=" Godavari Delta ";c=" Ganga Delta ";d=" Mississipi Delt ";ans="c";break;
		case 51:que="Where do the Bhagirathi and the Alakananda meet at? ";
		a="Haridwar " ;b="Devaprayag ";c="Karnaprayag ";d="Rudraprayag ";ans="b";break;
		case 52:que="The total length of the coastline of India is ";
		a="6600" ;b="7500";c="5600";d="4500";ans="b";break;
		case 53:que="Which of the following pair is correct?";
		a="Gujarat — Kandla" ;b="Karnataka — Tuticorin";c=" Maharastra — Paradip ";d=" T`.N. — Mangalore";ans="a";break;
		case 54:que="River Ganga flows into the sea through ";
		a="A bird's foot estuary" ;b="A Delta";c="An estuary";d=" None of the above ";ans="b";break;
		case 55:que="National Remote sensing Agency is located at";
		a="Chennai" ;b="Hyderabad";c="Dehradun";d="Kolkata";ans="b";break;
		case 56:que="The Chattisgarh state was carved out of ";
		a="UP" ;b="Madhya Pradesh";c="Maharastra";d="Bihar";ans="b";break;
		case 57:que=" Kapildhara Falls is located on ";
		a="River Narmada" ;b="River Krishna";c="River Sone";d="River Chambal";ans="a";break;
		case 58:que=" The source of the Narmada River lies in ";
		a="Mikhail Range" ;b="Palni Hills";c="Amarkantak Plateau";d="Vindhya Range";ans="c";break;
		case 59:que=" In India which state has the largest coal reserve? ";
		a="Chattisgarh" ;b="West Bengal";c="Orissa";d="Jharkhand";ans="d";break;
		case 60:que=" Which is the first nuclear station of India ? ";
		a="Kalpakkam" ;b="Narora";c="Tarapur";d="Trombay";ans="c";break;
		case 61:que=" Which of the following States grows sugarcane as a major crop? ";
		a="Uttar Pradesh" ;b="Punjab";c="Bihar";d="Rajasthan";ans="a";break;
		case 62:que="Which city is referred to as the 'Silicon Valley of India'? ";
		a="Mumbai" ;b="Chennai";c="Hyderabad";d="Bangalore";ans="d";break;
		case 63:que="The maximum area under crops in India is used for the cultivation of ";
		a="Wheat" ;b="Rice";c="Sugarcane";d="Cotton";ans="b";break;
		case 64:que="Where is the Bandipur National Park? ";
		a="Rajasthan" ;b="Andhra pradesh";c="Karnataka";d="Assam";ans="c";break;
		case 65:que=" Which is the first national park established in India? ";
		a="Velvadan National Park" ;b="Periyar National Park";c="Bandipur National Park";d="Corbett National Park";ans="d";break;
		case 66:que="'Kulu Valley' in India is famous for the cultivation of";
		a="Grapes" ;b="Potatoes";c="Apples";d="Strawberry";ans="c";break;
		case 67:que=" The Valley of Kashmir is located on a ";
		a="nappe" ;b="fault trough";c="plateau";d="plain";ans="a";break;
		case 68:que="Who wrote the Mahabharata?";
		a="Valmiki" ;b="Ved Vyas";c="Vishvamitra";d="Tulsidas";ans="b";break;
		case 69:que="Who wrote Ramayana?";
		a="Valmiki" ;b="Ved Vyas";c="Vishvamitra";d="Tulsidas";ans="a";break;
		case 70:que="The strongest muscle in our body is";
		a="Tongue" ;b="Skeletal";c="Smooth";d="Cardiac";ans="a";break;
		}
		System.out.println("\nQuestion "+op+":"+que);
		System.out.println("A : "+a+"	"+"B : "+b);
		System.out.println("C : "+c+"	"+"D : "+d);
	}
}