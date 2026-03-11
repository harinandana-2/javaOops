class Cpu {
int price=20000;
class Processor {
   int cores=4;
   String manufacture="Intel";
   }
   static class RAM  {
   int memory=8;
   String manufacture="samsung";
   }
   public static void main(String[]args)  {
     Cpu cpu=new Cpu();
     System.out.println("CPU price:"+cpu.price);
     Cpu.Processor p=cpu.new Processor();
     System.out.println("processor Cores:"+p.cores);
     System.out.println("processor manufactures:"+p.manufacture);
     Cpu.RAM r=new Cpu.RAM();
     System.out.println("RAM Memory:" +r.memory + "GB");
     System.out.println("RAM Manufacture:"+r.manufacture);
     }
     }
     
