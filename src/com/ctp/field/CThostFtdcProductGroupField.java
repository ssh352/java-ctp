/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcProductGroupField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcProductGroupField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcProductGroupField obj)
	{
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize()
	{
		delete();
	}

	public synchronized void delete()
	{
		if (swigCPtr != 0)
		{
			if (swigCMemOwn)
			{
				swigCMemOwn = false;
				ctpJNI.delete_CThostFtdcProductGroupField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setProductID(String value)
	{
		ctpJNI.CThostFtdcProductGroupField_ProductID_set(swigCPtr, this, value);
	}

	public String getProductID()
	{
		return ctpJNI.CThostFtdcProductGroupField_ProductID_get(swigCPtr, this);
	}

	public void setExchangeID(String value)
	{
		ctpJNI.CThostFtdcProductGroupField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID()
	{
		return ctpJNI.CThostFtdcProductGroupField_ExchangeID_get(swigCPtr, this);
	}

	public void setProductGroupID(String value)
	{
		ctpJNI.CThostFtdcProductGroupField_ProductGroupID_set(swigCPtr, this, value);
	}

	public String getProductGroupID()
	{
		return ctpJNI.CThostFtdcProductGroupField_ProductGroupID_get(swigCPtr, this);
	}

	public CThostFtdcProductGroupField()
	{
		this(ctpJNI.new_CThostFtdcProductGroupField(), true);
	}
}
