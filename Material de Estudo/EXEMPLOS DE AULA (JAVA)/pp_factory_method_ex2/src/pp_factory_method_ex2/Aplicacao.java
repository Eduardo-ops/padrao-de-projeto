package pp_factory_method_ex2;

public abstract class Aplicacao {

	protected Documento doc;

    /**
    * Abstração do Factory Method
    */
     abstract Documento criaDocumento();

     public void novoDocumento() {
         this.doc = this.criaDocumento();
         System.out.println("Factory Method criou um novo objeto: ");
         System.out.println(doc);
     }

     
}
