package specification.contacts;

/**
 * 
 * @author PapiHack
 * @version 1.0.0
 * @since 07/2020
 *
 */
public interface Specification<T>
{
	boolean isSatisfiedBy(T candidate);
	
	Specification<T> and(Specification<T> other);
	
	Specification<T> andNot(Specification<T> other);
	
	Specification<T> or(Specification<T> other);
	
	Specification<T> orNot(Specification<T> other);
	
	Specification<T> not(Specification<T> other);
	
}
