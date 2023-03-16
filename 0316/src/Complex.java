public class Complex {
	int imaginary;
	int real;
	
	public Complex() {}
	public Complex(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	@Override
	public String toString() {
		return real + "+" + imaginary + "i";
	}
	
	@Override
	public int hashCode() {
		return real + imaginary;                 
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Complex == false) {
			return false;
		}
		Complex C = (Complex)obj;
		return (C.real == real) && (C.imaginary == imaginary);
	}
	
	
	
}
