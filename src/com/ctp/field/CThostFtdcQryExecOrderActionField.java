/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcQryExecOrderActionField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcQryExecOrderActionField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcQryExecOrderActionField obj)
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
				ctpJNI.delete_CThostFtdcQryExecOrderActionField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcQryExecOrderActionField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcQryExecOrderActionField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value)
	{
		ctpJNI.CThostFtdcQryExecOrderActionField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID()
	{
		return ctpJNI.CThostFtdcQryExecOrderActionField_InvestorID_get(swigCPtr, this);
	}

	public void setExchangeID(String value)
	{
		ctpJNI.CThostFtdcQryExecOrderActionField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID()
	{
		return ctpJNI.CThostFtdcQryExecOrderActionField_ExchangeID_get(swigCPtr, this);
	}

	public CThostFtdcQryExecOrderActionField()
	{
		this(ctpJNI.new_CThostFtdcQryExecOrderActionField(), true);
	}
}
