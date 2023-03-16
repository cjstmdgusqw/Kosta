import java.util.Comparator;

public class ComplexCompare implements Comparator<Complex> {

	@Override
	public int compare(Complex o1, Complex o2) {
		int ret = o1.real - o2.real;
		System.out.println(o1.real);
		if(ret == 0) {
			ret = o1.imaginary - o2.imaginary;
		}
		return ret;
	}

}
