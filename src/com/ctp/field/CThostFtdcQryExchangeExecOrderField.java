/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcQryExchangeExecOrderField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcQryExchangeExecOrderField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcQryExchangeExecOrderField obj)
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
				ctpJNI.delete_CThostFtdcQryExchangeExecOrderField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setParticipantID(String value)
	{
		ctpJNI.CThostFtdcQryExchangeExecOrderField_ParticipantID_set(swigCPtr, this, value);
	}

	public String getParticipantID()
	{
		return ctpJNI.CThostFtdcQryExchangeExecOrderField_ParticipantID_get(swigCPtr, this);
	}

	public void setClientID(String value)
	{
		ctpJNI.CThostFtdcQryExchangeExecOrderField_ClientID_set(swigCPtr, this, value);
	}

	public String getClientID()
	{
		return ctpJNI.CThostFtdcQryExchangeExecOrderField_ClientID_get(swigCPtr, this);
	}

	public void setExchangeInstID(String value)
	{
		ctpJNI.CThostFtdcQryExchangeExecOrderField_ExchangeInstID_set(swigCPtr, this, value);
	}

	public String getExchangeInstID()
	{
		return ctpJNI.CThostFtdcQryExchangeExecOrderField_ExchangeInstID_get(swigCPtr, this);
	}

	public void setExchangeID(String value)
	{
		ctpJNI.CThostFtdcQryExchangeExecOrderField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID()
	{
		return ctpJNI.CThostFtdcQryExchangeExecOrderField_ExchangeID_get(swigCPtr, this);
	}

	public void setTraderID(String value)
	{
		ctpJNI.CThostFtdcQryExchangeExecOrderField_TraderID_set(swigCPtr, this, value);
	}

	public String getTraderID()
	{
		return ctpJNI.CThostFtdcQryExchangeExecOrderField_TraderID_get(swigCPtr, this);
	}

	public CThostFtdcQryExchangeExecOrderField()
	{
		this(ctpJNI.new_CThostFtdcQryExchangeExecOrderField(), true);
	}
}
