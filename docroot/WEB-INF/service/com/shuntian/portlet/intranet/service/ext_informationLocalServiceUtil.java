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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for ext_information. This utility wraps
 * {@link com.shuntian.portlet.intranet.service.impl.ext_informationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ext_informationLocalService
 * @see com.shuntian.portlet.intranet.service.base.ext_informationLocalServiceBaseImpl
 * @see com.shuntian.portlet.intranet.service.impl.ext_informationLocalServiceImpl
 * @generated
 */
public class ext_informationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.shuntian.portlet.intranet.service.impl.ext_informationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the ext_information to the database. Also notifies the appropriate model listeners.
	*
	* @param ext_information the ext_information
	* @return the ext_information that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information addext_information(
		com.shuntian.portlet.intranet.model.ext_information ext_information)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addext_information(ext_information);
	}

	/**
	* Creates a new ext_information with the primary key. Does not add the ext_information to the database.
	*
	* @param extId the primary key for the new ext_information
	* @return the new ext_information
	*/
	public static com.shuntian.portlet.intranet.model.ext_information createext_information(
		long extId) {
		return getService().createext_information(extId);
	}

	/**
	* Deletes the ext_information with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extId the primary key of the ext_information
	* @return the ext_information that was removed
	* @throws PortalException if a ext_information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information deleteext_information(
		long extId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteext_information(extId);
	}

	/**
	* Deletes the ext_information from the database. Also notifies the appropriate model listeners.
	*
	* @param ext_information the ext_information
	* @return the ext_information that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information deleteext_information(
		com.shuntian.portlet.intranet.model.ext_information ext_information)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteext_information(ext_information);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ext_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ext_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.shuntian.portlet.intranet.model.ext_information fetchext_information(
		long extId) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchext_information(extId);
	}

	/**
	* Returns the ext_information with the matching UUID and company.
	*
	* @param uuid the ext_information's UUID
	* @param companyId the primary key of the company
	* @return the matching ext_information, or <code>null</code> if a matching ext_information could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information fetchext_informationByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchext_informationByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the ext_information with the primary key.
	*
	* @param extId the primary key of the ext_information
	* @return the ext_information
	* @throws PortalException if a ext_information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information getext_information(
		long extId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getext_information(extId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the ext_information with the matching UUID and company.
	*
	* @param uuid the ext_information's UUID
	* @param companyId the primary key of the company
	* @return the matching ext_information
	* @throws PortalException if a matching ext_information could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information getext_informationByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getext_informationByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of all the ext_informations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ext_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext_informations
	* @param end the upper bound of the range of ext_informations (not inclusive)
	* @return the range of ext_informations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.ext_information> getext_informations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getext_informations(start, end);
	}

	/**
	* Returns the number of ext_informations.
	*
	* @return the number of ext_informations
	* @throws SystemException if a system exception occurred
	*/
	public static int getext_informationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getext_informationsCount();
	}

	/**
	* Updates the ext_information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ext_information the ext_information
	* @return the ext_information that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information updateext_information(
		com.shuntian.portlet.intranet.model.ext_information ext_information)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateext_information(ext_information);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static ext_informationLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ext_informationLocalService.class.getName());

			if (invokableLocalService instanceof ext_informationLocalService) {
				_service = (ext_informationLocalService)invokableLocalService;
			}
			else {
				_service = new ext_informationLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ext_informationLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ext_informationLocalService service) {
	}

	private static ext_informationLocalService _service;
}