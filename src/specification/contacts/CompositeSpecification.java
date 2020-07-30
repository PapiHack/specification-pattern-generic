package specification.contacts;

import specification.operators.AndNotSpecification;
import specification.operators.AndSpecification;
import specification.operators.NotSpecification;
import specification.operators.OrNotSpecification;
import specification.operators.OrSpecification;

/**
 * 
 * @author PapiHack
 * @version 1.0.0
 * @since 07/2020
 *
 */
public abstract class CompositeSpecification<T> implements Specification<T>
{
	public abstract boolean isSatisfiedBy(T candidate);
	
	public Specification<T> and(Specification<T> other)
	{
		return new AndSpecification<T>(this, other);
	}
	
	public Specification<T> andNot(Specification<T> other)
	{
		return new AndNotSpecification<T>(this, other);
	}
	
	public Specification<T> or(Specification<T> other)
	{
		return new OrSpecification<T>(this, other);
	}
	
	public Specification<T> orNot(Specification<T> other)
	{
		return new OrNotSpecification<T>(this, other);
	}
	
	public Specification<T> not(Specification<T> other)
	{
		return new NotSpecification<T>(other);
	}
}
