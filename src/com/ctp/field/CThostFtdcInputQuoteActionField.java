/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcInputQuoteActionField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcInputQuoteActionField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcInputQuoteActionField obj)
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
				ctpJNI.delete_CThostFtdcInputQuoteActionField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcInputQuoteActionField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcInputQuoteActionField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value)
	{
		ctpJNI.CThostFtdcInputQuoteActionField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID()
	{
		return ctpJNI.CThostFtdcInputQuoteActionField_InvestorID_get(swigCPtr, this);
	}

	public void setQuoteActionRef(int value)
	{
		ctpJNI.CThostFtdcInputQuoteActionField_QuoteActionRef_set(swigCPtr, this, value);
	}

	public int getQuoteActionRef()
	{
		return ctpJNI.CThostFtdcInputQuoteActionField_QuoteActionRef_get(swigCPtr, this);
	}

	public void setQuoteRef(String value)
	{
		ctpJNI.CThostFtdcInputQuoteActionField_QuoteRef_set(swigCPtr, this, value);
	}

	public String getQuoteRef()
	{
		return ctpJNI.CThostFtdcInputQuoteActionField_QuoteRef_get(swigCPtr, this);
	}

	public void setRequestID(int value)
	{
		ctpJNI.CThostFtdcInputQuoteActionField_RequestID_set(swigCPtr, this, value);
	}

	public int getRequestID()
	{
		return ctpJNI.CThostFtdcInputQuoteActionField_RequestID_get(swigCPtr, this);
	}

	public void setFrontID(int value)
	{
		ctpJNI.CThostFtdcInputQuoteActionField_FrontID_set(swigCPtr, this, value);
	}

	public int getFrontID()
	{
		return ctpJNI.CThostFtdcInputQuoteActionField_FrontID_get(swigCPtr, this);
	}

	public void setSessionID(int value)
	{
		ctpJNI.CThostFtdcInputQuoteActionField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID()
	{
		return ctpJNI.CThostFtdcInputQuoteActionField_SessionID_get(swigCPtr, this);
	}

	public void setExchangeID(String value)
	{
		ctpJNI.CThostFtdcInputQuoteActionField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID()
	{
		return ctpJNI.CThostFtdcInputQuoteActionField_ExchangeID_get(swigCPtr, this);
	}

	public void setQuoteSysID(String value)
	{
		ctpJNI.CThostFtdcInputQuoteActionField_QuoteSysID_set(swigCPtr, this, value);
	}

	public String getQuoteSysID()
	{
		return ctpJNI.CThostFtdcInputQuoteActionField_QuoteSysID_get(swigCPtr, this);
	}

	public void setActionFlag(char value)
	{
		ctpJNI.CThostFtdcInputQuoteActionField_ActionFlag_set(swigCPtr, this, value);
	}

	public char getActionFlag()
	{
		return ctpJNI.CThostFtdcInputQuoteActionField_ActionFlag_get(swigCPtr, this);
	}

	public void setUserID(String value)
	{
		ctpJNI.CThostFtdcInputQuoteActionField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID()
	{
		return ctpJNI.CThostFtdcInputQuoteActionField_UserID_get(swigCPtr, this);
	}

	public void setInstrumentID(String value)
	{
		ctpJNI.CThostFtdcInputQuoteActionField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID()
	{
		return ctpJNI.CThostFtdcInputQuoteActionField_InstrumentID_get(swigCPtr, this);
	}

	public CThostFtdcInputQuoteActionField()
	{
		this(ctpJNI.new_CThostFtdcInputQuoteActionField(), true);
	}
}
