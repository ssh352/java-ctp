/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcQryOptionInstrTradingRightField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcQryOptionInstrTradingRightField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcQryOptionInstrTradingRightField obj)
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
				ctpJNI.delete_CThostFtdcQryOptionInstrTradingRightField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcQryOptionInstrTradingRightField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcQryOptionInstrTradingRightField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value)
	{
		ctpJNI.CThostFtdcQryOptionInstrTradingRightField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID()
	{
		return ctpJNI.CThostFtdcQryOptionInstrTradingRightField_InvestorID_get(swigCPtr, this);
	}

	public void setInstrumentID(String value)
	{
		ctpJNI.CThostFtdcQryOptionInstrTradingRightField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID()
	{
		return ctpJNI.CThostFtdcQryOptionInstrTradingRightField_InstrumentID_get(swigCPtr, this);
	}

	public void setDirection(char value)
	{
		ctpJNI.CThostFtdcQryOptionInstrTradingRightField_Direction_set(swigCPtr, this, value);
	}

	public char getDirection()
	{
		return ctpJNI.CThostFtdcQryOptionInstrTradingRightField_Direction_get(swigCPtr, this);
	}

	public CThostFtdcQryOptionInstrTradingRightField()
	{
		this(ctpJNI.new_CThostFtdcQryOptionInstrTradingRightField(), true);
	}
}
