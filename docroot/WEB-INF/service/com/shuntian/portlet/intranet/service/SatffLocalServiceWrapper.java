/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.shuntian.portlet.intranet.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SatffLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SatffLocalService
 * @generated
 */
public class SatffLocalServiceWrapper implements SatffLocalService,
	ServiceWrapper<SatffLocalService> {
	public SatffLocalServiceWrapper(SatffLocalService satffLocalService) {
		_satffLocalService = satffLocalService;
	}

	/**
	* Adds the satff to the database. Also notifies the appropriate model listeners.
	*
	* @param satff the satff
	* @return the satff that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Satff addSatff(
		com.shuntian.portlet.intranet.model.Satff satff)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _satffLocalService.addSatff(satff);
	}

	/**
	* Creates a new satff with the primary key. Does not add the satff to the database.
	*
	* @param id the primary key for the new satff
	* @return the new satff
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Satff createSatff(long id) {
		return _satffLocalService.createSatff(id);
	}

	/**
	* Deletes the satff with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the satff
	* @return the satff that was removed
	* @throws PortalException if a satff with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Satff deleteSatff(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _satffLocalService.deleteSatff(id);
	}

	/**
	* Deletes the satff from the database. Also notifies the appropriate model listeners.
	*
	* @param satff the satff
	* @return the satff that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Satff deleteSatff(
		com.shuntian.portlet.intranet.model.Satff satff)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _satffLocalService.deleteSatff(satff);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _satffLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _satffLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.SatffModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _satffLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.SatffModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _satffLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _satffLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _satffLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.shuntian.portlet.intranet.model.Satff fetchSatff(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _satffLocalService.fetchSatff(id);
	}

	/**
	* Returns the satff with the matching UUID and company.
	*
	* @param uuid the satff's UUID
	* @param companyId the primary key of the company
	* @return the matching satff, or <code>null</code> if a matching satff could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Satff fetchSatffByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _satffLocalService.fetchSatffByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the satff with the primary key.
	*
	* @param id the primary key of the satff
	* @return the satff
	* @throws PortalException if a satff with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Satff getSatff(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _satffLocalService.getSatff(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _satffLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the satff with the matching UUID and company.
	*
	* @param uuid the satff's UUID
	* @param companyId the primary key of the company
	* @return the matching satff
	* @throws PortalException if a matching satff could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Satff getSatffByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _satffLocalService.getSatffByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of all the satffs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.SatffModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of satffs
	* @param end the upper bound of the range of satffs (not inclusive)
	* @return the range of satffs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.shuntian.portlet.intranet.model.Satff> getSatffs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _satffLocalService.getSatffs(start, end);
	}

	/**
	* Returns the number of satffs.
	*
	* @return the number of satffs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSatffsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _satffLocalService.getSatffsCount();
	}

	/**
	* Updates the satff in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param satff the satff
	* @return the satff that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Satff updateSatff(
		com.shuntian.portlet.intranet.model.Satff satff)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _satffLocalService.updateSatff(satff);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _satffLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_satffLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _satffLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.shuntian.portlet.intranet.model.Satff addsatff(
		java.lang.String city, java.lang.String name, double base_pay,
		double performance_pay, double wage_subtotal, double insurance_base,
		double endowment_insurance, double unemployment_insurance,
		double work_injury_insurance, double birth_insurance,
		double medical_insurance, double individual_insurance,
		double housing_accumulation_fund_base, double individual_pay,
		double amount_payable, double people_together, long userId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _satffLocalService.addsatff(city, name, base_pay,
			performance_pay, wage_subtotal, insurance_base,
			endowment_insurance, unemployment_insurance, work_injury_insurance,
			birth_insurance, medical_insurance, individual_insurance,
			housing_accumulation_fund_base, individual_pay, amount_payable,
			people_together, userId, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SatffLocalService getWrappedSatffLocalService() {
		return _satffLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSatffLocalService(SatffLocalService satffLocalService) {
		_satffLocalService = satffLocalService;
	}

	@Override
	public SatffLocalService getWrappedService() {
		return _satffLocalService;
	}

	@Override
	public void setWrappedService(SatffLocalService satffLocalService) {
		_satffLocalService = satffLocalService;
	}

	private SatffLocalService _satffLocalService;
}