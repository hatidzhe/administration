public class Question9 
                                      {
                                        public static void main(String[] args)
                                        {
                                          if( args.length < 1 ) {
       System.out.println("Fehler: Bitte eine Zahl als Argument angeben.");
       System.exit(1);
}
                                          int v1;
                                          v1 = Integer.valueOf(args[0]).intValue();
                                          
                                          if(v1<0)
                                            System.out.println("Die Zahl ist negativ.");
                                          else
                                            System.out.println("Die Zahl ist positiv.");
                                            System.exit(0);
                                        }
                                      }	
                                      
