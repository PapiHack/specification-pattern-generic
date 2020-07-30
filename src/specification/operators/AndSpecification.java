package specification.operators;

import specification.contacts.CompositeSpecification;
import specification.contacts.Specification;

/**
 * 
 * @author PapiHack
 * @version 1.0.0
 * @since 07/2020
 *
 */
public class AndSpecification<T> extends CompositeSpecification<T>
{
	private Specification<T> leftSpecification;
	private Specification<T> rightSpecification;
	
	public AndSpecification(Specification<T> left, Specification<T> right)
	{
		this.setLeftSpecification(left);
		this.setRightSpecification(right);
	}
	
	public Specification<T> getLeftSpecification()
	{
		return this.leftSpecification;
	}
	
	public void setLeftSpecification(Specification<T> leftSpecification)
	{
		this.leftSpecification = leftSpecification;
	}
	
	public Specification<T> getRightSpecification()
	{
		return this.rightSpecification;
	}
	
	public void setRightSpecification(Specification<T> rightSpecification)
	{
		this.rightSpecification = rightSpecification;
	}
	
	@Override
	public boolean isSatisfiedBy(T candidate)
	{
		return this.leftSpecification.isSatisfiedBy(candidate) && this.rightSpecification.isSatisfiedBy(candidate);
	}
	
}
