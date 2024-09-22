package GameConfiguration.Modal;
 public class Modal {
     public static TTCM CurrentModal;
     static {
         Modal.CurrentModal = new TMP();
     }
     public static TTCM getTMP(){

         Modal.CurrentModal = new TMP();
         return Modal.CurrentModal;
     }
     public static TTCM getTSP(){

         Modal.CurrentModal = new TSP();
         return Modal.CurrentModal;
     }
}
