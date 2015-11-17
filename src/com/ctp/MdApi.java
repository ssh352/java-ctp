/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp;

import com.ctp.field.CThostFtdcFensUserInfoField;
import com.ctp.field.CThostFtdcReqUserLoginField;
import com.ctp.field.CThostFtdcUserLogoutField;
import com.ctp.swig.SWIGTYPE_p_p_char;
import com.ctp.swig.ctpJNI;

public class MdApi
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	public MdApi(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(MdApi obj)
	{
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	public synchronized void delete()
	{
		if (swigCPtr != 0)
		{
			if (swigCMemOwn)
			{
				swigCMemOwn = false;
				throw new UnsupportedOperationException("C++ destructor does not have public access");
			}
			swigCPtr = 0;
		}
	}

	public static MdApi CreateFtdcMdApi(String pszFlowPath, boolean bIsUsingUdp, boolean bIsMulticast)
	{
		long cPtr = ctpJNI.CThostFtdcMdApi_CreateFtdcMdApi__SWIG_0(pszFlowPath, bIsUsingUdp, bIsMulticast);
		return (cPtr == 0) ? null : new MdApi(cPtr, false);
	}

	public static MdApi CreateFtdcMdApi(String pszFlowPath, boolean bIsUsingUdp)
	{
		long cPtr = ctpJNI.CThostFtdcMdApi_CreateFtdcMdApi__SWIG_1(pszFlowPath, bIsUsingUdp);
		return (cPtr == 0) ? null : new MdApi(cPtr, false);
	}

	public static MdApi CreateFtdcMdApi(String pszFlowPath)
	{
		long cPtr = ctpJNI.CThostFtdcMdApi_CreateFtdcMdApi__SWIG_2(pszFlowPath);
		return (cPtr == 0) ? null : new MdApi(cPtr, false);
	}

	public static MdApi CreateFtdcMdApi()
	{
		long cPtr = ctpJNI.CThostFtdcMdApi_CreateFtdcMdApi__SWIG_3();
		return (cPtr == 0) ? null : new MdApi(cPtr, false);
	}

	public static String GetApiVersion()
	{
		return ctpJNI.CThostFtdcMdApi_GetApiVersion();
	}

	public void Release()
	{
		ctpJNI.CThostFtdcMdApi_Release(swigCPtr, this);
	}

	public void Init()
	{
		ctpJNI.CThostFtdcMdApi_Init(swigCPtr, this);
	}

	public int Join()
	{
		return ctpJNI.CThostFtdcMdApi_Join(swigCPtr, this);
	}

	public String GetTradingDay()
	{
		return ctpJNI.CThostFtdcMdApi_GetTradingDay(swigCPtr, this);
	}

	public void RegisterFront(String pszFrontAddress)
	{
		ctpJNI.CThostFtdcMdApi_RegisterFront(swigCPtr, this, pszFrontAddress);
	}

	public void RegisterNameServer(String pszNsAddress)
	{
		ctpJNI.CThostFtdcMdApi_RegisterNameServer(swigCPtr, this, pszNsAddress);
	}

	public void RegisterFensUserInfo(CThostFtdcFensUserInfoField pFensUserInfo)
	{
		ctpJNI.CThostFtdcMdApi_RegisterFensUserInfo(swigCPtr, this, CThostFtdcFensUserInfoField.getCPtr(pFensUserInfo),
				pFensUserInfo);
	}

	public void RegisterSpi(MdSpi pSpi)
	{
		ctpJNI.CThostFtdcMdApi_RegisterSpi(swigCPtr, this, MdSpi.getCPtr(pSpi), pSpi);
	}

	public int SubscribeMarketData(SWIGTYPE_p_p_char ppInstrumentID, int nCount)
	{
		return ctpJNI.CThostFtdcMdApi_SubscribeMarketData(swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(ppInstrumentID),
				nCount);
	}

	public int UnSubscribeMarketData(SWIGTYPE_p_p_char ppInstrumentID, int nCount)
	{
		return ctpJNI.CThostFtdcMdApi_UnSubscribeMarketData(swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(ppInstrumentID),
				nCount);
	}

	public int SubscribeForQuoteRsp(SWIGTYPE_p_p_char ppInstrumentID, int nCount)
	{
		return ctpJNI.CThostFtdcMdApi_SubscribeForQuoteRsp(swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(ppInstrumentID),
				nCount);
	}

	public int UnSubscribeForQuoteRsp(SWIGTYPE_p_p_char ppInstrumentID, int nCount)
	{
		return ctpJNI.CThostFtdcMdApi_UnSubscribeForQuoteRsp(swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(ppInstrumentID),
				nCount);
	}

	public int ReqUserLogin(CThostFtdcReqUserLoginField pReqUserLoginField, int nRequestID)
	{
		return ctpJNI.CThostFtdcMdApi_ReqUserLogin(swigCPtr, this,
				CThostFtdcReqUserLoginField.getCPtr(pReqUserLoginField), pReqUserLoginField, nRequestID);
	}

	public int ReqUserLogout(CThostFtdcUserLogoutField pUserLogout, int nRequestID)
	{
		return ctpJNI.CThostFtdcMdApi_ReqUserLogout(swigCPtr, this, CThostFtdcUserLogoutField.getCPtr(pUserLogout),
				pUserLogout, nRequestID);
	}
}
