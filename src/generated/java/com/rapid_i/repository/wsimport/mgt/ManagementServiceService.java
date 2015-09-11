/**
 * Copyright (C) 2001-2015 by RapidMiner and the contributors
 *
 * Complete list of developers available at our web site:
 *
 *      http://rapidminer.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 */
package com.rapid_i.repository.wsimport.mgt;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ManagementServiceService", targetNamespace = "http://service.web.rapidanalytics.de/", wsdlLocation = "http://localhost:8080/RAWS/ManagementService?wsdl")
public class ManagementServiceService
    extends Service
{

    private final static URL MANAGEMENTSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException MANAGEMENTSERVICESERVICE_EXCEPTION;
    private final static QName MANAGEMENTSERVICESERVICE_QNAME = new QName("http://service.web.rapidanalytics.de/", "ManagementServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/RAWS/ManagementService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MANAGEMENTSERVICESERVICE_WSDL_LOCATION = url;
        MANAGEMENTSERVICESERVICE_EXCEPTION = e;
    }

    public ManagementServiceService() {
        super(__getWsdlLocation(), MANAGEMENTSERVICESERVICE_QNAME);
    }

    public ManagementServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MANAGEMENTSERVICESERVICE_QNAME, features);
    }

    public ManagementServiceService(URL wsdlLocation) {
        super(wsdlLocation, MANAGEMENTSERVICESERVICE_QNAME);
    }

    public ManagementServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MANAGEMENTSERVICESERVICE_QNAME, features);
    }

    public ManagementServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ManagementServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ManagementService
     */
    @WebEndpoint(name = "ManagementServicePort")
    public ManagementService getManagementServicePort() {
        return super.getPort(new QName("http://service.web.rapidanalytics.de/", "ManagementServicePort"), ManagementService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ManagementService
     */
    @WebEndpoint(name = "ManagementServicePort")
    public ManagementService getManagementServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.web.rapidanalytics.de/", "ManagementServicePort"), ManagementService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MANAGEMENTSERVICESERVICE_EXCEPTION!= null) {
            throw MANAGEMENTSERVICESERVICE_EXCEPTION;
        }
        return MANAGEMENTSERVICESERVICE_WSDL_LOCATION;
    }

}
