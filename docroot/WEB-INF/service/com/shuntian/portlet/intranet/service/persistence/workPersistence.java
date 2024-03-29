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

package com.shuntian.portlet.intranet.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.shuntian.portlet.intranet.model.work;

/**
 * The persistence interface for the work service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see workPersistenceImpl
 * @see workUtil
 * @generated
 */
public interface workPersistence extends BasePersistence<work> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link workUtil} to access the work persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the works where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching works
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.work> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the works where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.workModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of works
	* @param end the upper bound of the range of works (not inclusive)
	* @return the range of matching works
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.work> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the works where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.workModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of works
	* @param end the upper bound of the range of works (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching works
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.work> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first work in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching work
	* @throws com.shuntian.portlet.intranet.NoSuchworkException if a matching work could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.work findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchworkException;

	/**
	* Returns the first work in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching work, or <code>null</code> if a matching work could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.work fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last work in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching work
	* @throws com.shuntian.portlet.intranet.NoSuchworkException if a matching work could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.work findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchworkException;

	/**
	* Returns the last work in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching work, or <code>null</code> if a matching work could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.work fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the works before and after the current work in the ordered set where uuid = &#63;.
	*
	* @param workId the primary key of the current work
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next work
	* @throws com.shuntian.portlet.intranet.NoSuchworkException if a work with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.work[] findByUuid_PrevAndNext(
		long workId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchworkException;

	/**
	* Removes all the works where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of works where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching works
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the works where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching works
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.work> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the works where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.workModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of works
	* @param end the upper bound of the range of works (not inclusive)
	* @return the range of matching works
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.work> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the works where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.workModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of works
	* @param end the upper bound of the range of works (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching works
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.work> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first work in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching work
	* @throws com.shuntian.portlet.intranet.NoSuchworkException if a matching work could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.work findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchworkException;

	/**
	* Returns the first work in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching work, or <code>null</code> if a matching work could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.work fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last work in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching work
	* @throws com.shuntian.portlet.intranet.NoSuchworkException if a matching work could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.work findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchworkException;

	/**
	* Returns the last work in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching work, or <code>null</code> if a matching work could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.work fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the works before and after the current work in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param workId the primary key of the current work
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next work
	* @throws com.shuntian.portlet.intranet.NoSuchworkException if a work with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.work[] findByUuid_C_PrevAndNext(
		long workId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchworkException;

	/**
	* Removes all the works where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of works where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching works
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the work in the entity cache if it is enabled.
	*
	* @param work the work
	*/
	public void cacheResult(com.shuntian.portlet.intranet.model.work work);

	/**
	* Caches the works in the entity cache if it is enabled.
	*
	* @param works the works
	*/
	public void cacheResult(
		java.util.List<com.shuntian.portlet.intranet.model.work> works);

	/**
	* Creates a new work with the primary key. Does not add the work to the database.
	*
	* @param workId the primary key for the new work
	* @return the new work
	*/
	public com.shuntian.portlet.intranet.model.work create(long workId);

	/**
	* Removes the work with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param workId the primary key of the work
	* @return the work that was removed
	* @throws com.shuntian.portlet.intranet.NoSuchworkException if a work with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.work remove(long workId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchworkException;

	public com.shuntian.portlet.intranet.model.work updateImpl(
		com.shuntian.portlet.intranet.model.work work)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the work with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchworkException} if it could not be found.
	*
	* @param workId the primary key of the work
	* @return the work
	* @throws com.shuntian.portlet.intranet.NoSuchworkException if a work with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.work findByPrimaryKey(
		long workId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchworkException;

	/**
	* Returns the work with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param workId the primary key of the work
	* @return the work, or <code>null</code> if a work with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.work fetchByPrimaryKey(
		long workId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the works.
	*
	* @return the works
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.work> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the works.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.workModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of works
	* @param end the upper bound of the range of works (not inclusive)
	* @return the range of works
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.work> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the works.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.workModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of works
	* @param end the upper bound of the range of works (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of works
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.work> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the works from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of works.
	*
	* @return the number of works
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}