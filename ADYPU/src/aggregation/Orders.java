package aggregation;

public class Orders {
	 int id;
	    String orderId;
	    String product;
	    User userId;//entitiy referance

	    Orders(int id,String orderId,String product,User userId){
	        this.id=id;
	        this.orderId=orderId;
	        this.product=product;
	        this.userId=userId;
	    }

	   private void showData(){
	       System.out.println(
	               "id : "+id+"\n"+
	               "orderId : "+orderId+"\n"+
	               "product : "+product+"\n"+
	               "userId : "+userId.id+"\n"+
	               "name : "+userId.name
	               );

}
