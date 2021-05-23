package kodlamaio.hrms.core.utilities.results;

public class DataResult<T> extends Result{

	private T data;
	
	public DataResult(T data,boolean success, String message) {
		super(success, message);
		this.data=data;
		// TODO Auto-generated constructor stub
	}
	
	public DataResult(T data,boolean success) {
		super(success);
		this.data=data;
		// TODO Auto-generated constructor stub
	}
	
	public T getData() {
		return this.data;
	}

}
