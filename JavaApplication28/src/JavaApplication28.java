import java.util.*;
import java.io.*;
class Compinfo
{
int sal;
int reqper;
double phno;
String cname;
String degreq;
String add;
void displayRecord()
{
System.out.print("CAOMPANY NAME "  +cname);
System.out.println(" COMPANY phno "          + phno);
System.out.println("COMPANY sal "  +sal);
System.out.println(" COMPANY deg"  +degreq);
System.out.println("COMPANY per"   +reqper);
System.out.println("Address "   +add);
}
}
class Pass{
    String user,pass;
}
class Jobinfo
{
int expsal;
int phno;
int eduper;
String name;
String deg;
String add;
void displayRecord()
{
System.out.print("NAME "  +name);
System.out.println("phno "          + phno);
System.out.println("expsal "  +expsal);
System.out.println("deg"  +deg);
System.out.println("percentage"  +eduper);
System.out.println("Address "   +add);

}
}
class JavaApplication28 {
public static void main(String args[])
throws IOException {
int k=0,i=1,num=0,phno2=0;
int choice=0,rph1 = 0;
double rrph1=0;
String str="",loginName,passWord;
boolean flag=true;
int phno1;
    phno1 = 0;
    int phno3 = 0,num1=0;
    boolean flag1=true;
Scanner obj=new Scanner(System.in);
Compinfo record = new Compinfo();
Compinfo record1 = new Compinfo();
Jobinfo record2=new Jobinfo();
Jobinfo record3=new Jobinfo();
Jobinfo record4 = new Jobinfo();//=new Jobinfo();Jobinfo record5=new Jobinfo();
Pass bb=new Pass();
while(flag1){
System.out.println("ENTER USER ID:");
String check=obj.next();
 FileReader ch = new FileReader("pass.txt");
                    Scanner sch = new Scanner(ch);
                    while(sch.hasNext())
                    {
                        bb.user=sch.next();
                        bb.pass=sch.next();
                        if(check.equals(bb.user))
                        {
                            flag1=false;
                            break;
                            
                        }
                    }
}
flag1=true;
while(flag1){
System.out.println("ENTER PASSWORD:");
String check=obj.next();
 FileReader ch = new FileReader("pass.txt");
                    Scanner sch = new Scanner(ch);
                    while(sch.hasNext())
                    {
                        bb.user=sch.next();
                        bb.pass=sch.next();
                        if(check.equals(bb.pass))
                        {
                             flag1=false;
                            break;
                           
                        }
                    }
}

System.out.println("1.JOB SEEKER\n2.JOB PROVIDER\nENTER YOUR CHOICE");
choice=obj.nextInt();
if(choice==1)
{
    while(true)
{


    while(flag)
    {
        System.out.println("\n   Menu");
            System.out.println("1. ADD YOUR RESUME");
            System.out.println("2.TO SEARCH AND GENERATE PRINT OUT OF YOUR RESUME ");
            System.out.println("3.TO UPDATE YOU DETAILS ");
            System.out.println("4.TO SHOW ALL JOBS \n5.TO SHOW BEST JOB\n6.QUIT");
            System.out.print("Enter your choice: ");
            choice = obj.nextInt();
            switch (choice) {
                case 1:
                    FileWriter fout = new FileWriter("job2.txt", true);

                    for (i = 0; i < 1; i++) {
                        System.out.print("enter phno: ");
                        record2.phno = obj.nextInt();
                        System.out.print("Enter name:");
                        record2.name = obj.next();

                        System.out.print("Enter degree:");
                        record2.deg = obj.next();
                        System.out.println("Enter your percentage");
                        record2.eduper=obj.nextInt();
                        System.out.print("Enter  place:");
                        record2.add = obj.next();
                        System.out.println("enter sal");
                        record2.expsal = obj.nextInt();

                        fout.write(record2.phno + "           \n");
                        fout.write(record2.name + "         \n");
                        fout.write(record2.deg + "              \n");
                        fout.write(record2.eduper + "           \n");
                        fout.write(record2.add + "                \n");
                        fout.write(record2.expsal + "          \n");
                    }
                    fout.write("\r\012");
                    fout.close();
                    System.out.println("File is created");
                    break;
                case 2:
                    i=0;
                    System.out.print("enter phno: ");
        double phno = obj.nextInt();
                    FileReader fin = new FileReader("job2.txt");
                    Scanner sc = new Scanner(fin);
                    while (sc.hasNextFloat()) {
                        record2.phno = sc.nextInt();
                        record2.name = sc.next();
                        record2.deg = sc.next();
                        record2.eduper=sc.nextInt();
                        record2.add = sc.next();
                        record2.expsal = sc.nextInt();
                        if (phno == record2.phno) {
                           
                            i++;
                            //System.out.println(+i);
                            //record2.displayRecord();
                            
                        }
                    }
                    if(i==0)
                    {
                        System.out.println("no resume found ");
                        break;
                    
                    //fin.close();
                    }
                    fin.close();
                    int k1=0;
                    FileReader fin34 = new FileReader("job2.txt");
                    Scanner sc3 = new Scanner(fin34);
                    while (sc3.hasNextInt()) {
                        record2.phno = sc3.nextInt();
                        record2.name = sc3.next();
                        record2.deg = sc3.next();
                        record2.eduper=sc3.nextInt();
                        record2.add = sc3.next();
                        record2.expsal = sc3.nextInt();
                        if (phno == record2.phno) {
                            k1++;
                            if(i==k1)
                            {
                              //  System.out.println(+k);
                            record2.displayRecord();
                            break;
                            }
                        }
                    }
                    break;
                case 3:
                    i=0;
               System.out.print("enter phno: ");
                    phno = obj.nextDouble();
     
                    FileReader fin1 = new FileReader("job2.txt");
                    Scanner sc1 = new Scanner(fin1);
                    while (sc1.hasNextFloat()) {
                        record2.phno = sc1.nextInt();
                        record2.name = sc1.next();
                        record2.deg = sc1.next();
                        record2.eduper=sc1.nextInt();
                        record2.add = sc1.next();
                        record2.expsal = sc1.nextInt();
                           if(phno==record2.phno)
                           {
                               i++;
                               
                           }
                    }
                    if(i==0)
                    {
                        System.out.println("no resume found ");
                        break;
                    
                    //fin.close();
                    }
                    k1=0;
                    FileReader fin4 = new FileReader("job2.txt");
                    Scanner sc4 = new Scanner(fin4);
                    while (sc4.hasNextFloat()) {
                        record2.phno = sc4.nextInt();
                        record2.name = sc4.next();
                        record2.deg = sc4.next();
                        record2.eduper=sc4.nextInt();
                        record2.add = sc4.next();
                        record2.expsal = sc4.nextInt();
                        if (phno == record2.phno) {
                            k1++;
                            if(i==k1)
                            {
                            record2.displayRecord();
                            break;
                            }
                        }
                    }
                    System.out.println("press 1 to continue else 0");
                    choice=obj.nextInt();
                    if(choice==1)
                    {
                    FileWriter fout1 = new FileWriter("job2.txt", true);

                    for (i = 0; i < 1; i++) {
                        
                        System.out.print("Enter name:");
                        record2.name = obj.next();

                        System.out.print("Enter degree:");
                        record2.deg = obj.next();
                        System.out.println("Enter your percentage");
                        record2.eduper=obj.nextInt();
                        System.out.print("Enter  place:");
                        record2.add = obj.next();
                        System.out.println("enter sal");
                        record2.expsal = obj.nextInt();
                        

                        fout1.write(record2.phno + "           \n");
                        fout1.write(record2.name + "         \n");
                        fout1.write(record2.deg + "              \n");
                        fout1.write(record2.eduper + "              \n");
                        fout1.write(record2.add + "                \n");
                        fout1.write(record2.expsal + "          \n");
                    }
                    fout1.write("\r\012");
                    fout1.close();
                    System.out.println("YOUR RESUME IS UPDATED");
                    fin1.close();
                    }
                    
                    break;
                case 4:
                    System.out.print("enter degree ");
String cname1 = obj.next();
FileReader fin11 = new FileReader("job3.txt");
 Scanner sc11 = new Scanner(fin11);
 while(sc11.hasNextFloat())
 {
            record1.phno = sc11.nextDouble();
            record1.cname = sc11.next();
            record1.degreq= sc11.next();
            record1.reqper=sc11.nextInt();
            record1.add=sc11.next();
            record1.sal=sc11.nextInt();
     if(cname1.equals(record1.degreq))
     {
 record1.displayRecord();
 phno3++;
     }
 }
 fin11.close();
 if(phno3==0)
 {
     System.out.println("no job found");
 }

 
break;
                case 5:
                         System.out.print("enter degree ");
                         String name2 = obj.next();
                         FileReader fin5 = new FileReader("job3.txt");
                         Scanner sc5 = new Scanner(fin5);
                        
                         while(sc5.hasNextFloat())
                         {
                            record1.phno = sc5.nextDouble();
                            record1.cname = sc5.next();
                            record1.degreq= sc5.next();
                            record1.reqper=sc5.nextInt();
                            record1.add=sc5.next();
                            record1.sal=sc5.nextInt();
                            i=record1.sal;
                            if(name2.equals(record1.degreq))
                            {
                            if(i>=num1)
                            {
                            phno3++;    
                            num1=i;
                                rrph1 = record1.phno;
                            }
         
                            }
                         }
   
 fin5.close();
 if(phno3==0)
 {
     System.out.println("no job found");
     break;
 }
    FileReader fin12 = new FileReader("job3.txt");
                Scanner sc12 = new Scanner(fin12);
                while (sc12.hasNextFloat()) {
                        record.phno = sc12.nextDouble();
                        record.cname = sc12.next();
                        record.degreq = sc12.next();
                        record.reqper=sc12.nextInt();
                        record.add = sc12.next();
                        record.sal = sc12.nextInt();
                        if (rrph1 == record.phno) {
                            
                            record.displayRecord();
                        }
                    }
                fin12.close();
             
 if(phno3==0)
 {
     System.out.println("no job found");
     break;
 }

 System.out.println("press 1  to send the call letter to candidate");
 int res1=obj.nextInt();
 if(res1==1)
 {
     System.out.println("WE HAVE SENT YOUR RESUME TO RESPECTIVE COMPANY THEY WILL CONTACT YOU SOON");
     System.out.println("YOU ARE APPLIED SUCCESSFULLY");
      break;
 }
break;  


                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong Choice!!");
            }
}
}
}
else if(choice==2)
{
  
while(flag)
{
    System.out.println("\n   Menu");
    System.out.println("1. ADD NEW JOB");
    System.out.println("2.TO SEARCH AND GENERATE PRINT OUT OF YOUR JOB ");
    System.out.println("3.TO UPDATE YOU DETAILS ");
    System.out.println("4.TO SHOW ALL CANDIDATES \n5.TO SHOW BEST CANDIDATE\n6.QUIT");
    System.out.print("Enter your choice: ");
    choice = obj.nextInt();
    switch (choice) {
       case 1:
                FileWriter fout = new FileWriter("job3.txt", true);
                for (i = 0; i < 1; i++) {
                        System.out.print("enter phno: ");
                        record.phno = obj.nextDouble();
                        System.out.print("Enter name of company:");
                        record. cname = obj.next();

                        System.out.print("Enter degree required:");
                        record.degreq = obj.next();
                        System.out.println("Enter required percentage");
                        record.reqper=obj.nextInt();
                        System.out.print("Enter  place:");
                        record.add = obj.next();
                        System.out.println("enter salary: ");
                        record.sal = obj.nextInt();

                        fout.write(record.phno + "           \n");
                        fout.write(record.cname + "         \n");
                        fout.write(record.degreq + "              \n");
                        fout.write(record.reqper + "                 \n");
                        fout.write(record.add + "                \n");
                        fout.write(record.sal + "          \n");
                    }
                    fout.write("\r\012");
                    fout.close();
                    System.out.println("File is created");
                    break;
        case 2:
                System.out.print("enter phno: ");
        double phno = obj.nextDouble();
        i=0;
                FileReader fin = new FileReader("job3.txt");
                Scanner sc = new Scanner(fin);
                while (sc.hasNextFloat()) {
                        record.phno = sc.nextDouble();
                        record.cname = sc.next();
                        record.degreq = sc.next();
                        record.reqper=sc.nextInt();
                        record.add = sc.next();
                        record.sal = sc.nextInt();
                        if (phno == record.phno) {
                            i++;
                            System.out.println(+i);
                           // record.displayRecord();
                        }
                    }
                 if(i==0)
                    {
                        System.out.println("no job found");
                        break;
                    }
                int j=0;
                   // for(j=0;j<=i;j++)
                    //{
//                        System.out.println("j"+j);
                FileReader fiin = new FileReader("job3.txt");
                Scanner scc = new Scanner(fiin);
                        while (scc.hasNextFloat()) {
                        record.phno = scc.nextDouble();
                        record.cname = scc.next();
                        record.degreq = scc.next();
                        record.reqper=scc.nextInt();
                        record.add = scc.next();
                        record.sal = scc.nextInt();
                        
                            if(phno == record.phno)
                            {
                               j++;
                               if(i==j)
                            record.displayRecord();
                            
                        }
  //                  }
                    }
                    fin.close();
                    
                    break;
                case 3:
               System.out.print("enter phno: ");
                    phno = obj.nextDouble();
     i=0;
                    FileReader fin1 = new FileReader("job3.txt");
                    
                    Scanner sc1 = new Scanner(fin1);
FileWriter fout1 = new FileWriter("job3.txt", true);
                    while (sc1.hasNextFloat()) {
                        record.phno = sc1.nextDouble();
                        record.cname = sc1.next();
                        record.degreq = sc1.next();
                        record.reqper=sc1.nextInt();
                        record.add = sc1.next();
                        record.sal = sc1.nextInt();
                          if (phno == record.phno) {
                            i++;
                            //System.out.println(+i);
                           // record.displayRecord();
                        }
                    }
                    if(i==0)
                    {
                        System.out.println("no job found");
                        break;
                    }
                 j=0;
                   // for(j=0;j<=i;j++)
                    //{
//                        System.out.println("j"+j);
                FileReader fin11 = new FileReader("job3.txt");
                Scanner scc1 = new Scanner(fin11);
                        while (scc1.hasNextFloat()) {
                        record.phno = scc1.nextDouble();
                        record.cname = scc1.next();
                        record.degreq = scc1.next();
                        record.reqper=scc1.nextInt();
                        record.add = scc1.next();
                        record.sal = scc1.nextInt();
                        
                            if(phno == record.phno)
                            {
                               j++;
                               if(i==j)
                            record.displayRecord();
                            
                        }
  //                  }
                    }
                    
                    //fout1.close();
                    //fin1.close();
                    System.out.println("press 1 to continue else 0");
                    choice=obj.nextInt();
                    if(choice==1)
                    {
                    FileWriter fout11 = new FileWriter("job3.txt", true);

                    for (i = 0; i < 1; i++) {
                        record1.phno=record.phno;
                        System.out.print("Enter company name:");
                       record1.cname = obj.next();

                        System.out.print("Enter degree required:");
                        record1.degreq = obj.next();
                        System.out.println("Enter percentagge required");
                        record1.reqper=obj.nextInt();
                        System.out.print("Enter  place:");
                        record1.add = obj.next();
                        System.out.println("enter salary");
                        record1.sal = obj.nextInt();

                       fout11.write(record1.phno + "           \n");
                        fout11.write(record1.cname + "         \n");
                        fout11.write(record1.degreq + "              \n");
                        fout11.write(record1.reqper + "             \n");
                        fout11.write(record1.add + "                \n");
                     fout11.write(record1.sal + "          \n");
                     fout11.write("\r\012");
                    }
                    fout11.close();
                    System.out.println("YOUR JOB DETAILS ARE  UPDATED");
                    //fin1.close();
                    }
                    
                    break;
        
                
                case 4:
                    phno2=0;
                    System.out.print("enter degree ");
String degn = obj.next();
FileReader fin2 = new FileReader("job2.txt");
 Scanner sc2 = new Scanner(fin2);
 while(sc2.hasNextFloat())
 {
            record2.phno = sc2.nextInt();
            record2.name = sc2.next();
            record2.deg= sc2.next();
           record2.eduper=sc2.nextInt();
            record2.add=sc2.next();
            record2.expsal=sc2.nextInt();
            i=record2.expsal;
            if(choice==4)
            {
     if(degn.equals(record2.deg))
     {
         phno2++;
 record2.displayRecord();
     }
   
 }
 }
  if(phno2==0)
 {
     System.out.println("no candidate exists");
     break;
 }

break;
case 5:
                     System.out.print("enter degree ");
String name2 = obj.next();
FileReader fin5 = new FileReader("job2.txt");
 Scanner sc5 = new Scanner(fin5);
int num2=111111110;
phno3=0;
 while(sc5.hasNextFloat())
 {
            record3.phno = sc5.nextInt();
        int rph = record3.phno;
            record3.name = sc5.next();
            record3.deg= sc5.next();
            record3.add=sc5.next();
            record3.expsal=sc5.nextInt();
            i=record3.eduper;
     if(name2.equals(record3.deg))
     {
        
             if(i<=num2)
             {
                 phno3++;
                 rph1 = rph;    
             num2=i;
             }
     }
     
 }
 if(phno3==0)
     System.out.println("no candidates found");
 fin5.close();
 FileReader fin123 = new FileReader("job2.txt");
                    Scanner sc123 = new Scanner(fin123);
                    while (sc123.hasNextFloat()) {
                        record2.phno = sc123.nextInt();
                        record2.name = sc123.next();
                        record2.deg = sc123.next();
                        record2.eduper=sc123.nextInt();
                        record2.add = sc123.next();
                        record2.expsal = sc123.nextInt();
                        if (rph1== record2.phno) 
                            record2.displayRecord();
                        }
              fin123.close();      

 System.out.println("press 1  to send the call letter to candidate");
 int res1=obj.nextInt();
 if(res1==1)
 {
     System.out.println("WE HAVE SENT CALL LETTER TO THE CANDIDATE");
      record3.displayRecord();
 }
break;  


                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong Choice!!");
            }
}
}  
}
}