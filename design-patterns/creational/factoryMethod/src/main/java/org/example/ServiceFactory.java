package org.example;

/**
 * Factory class for creating service instances using the Factory Method pattern.
 * 
 * @version 1.0
 */
public class ServiceFactory {
    /**
     * Gets a service instance by name.
     * 
     * @param service the service name (e.g., "Boleto", "Pix", "Cartao", "Saldo")
     * @return the service instance
     * @throws IllegalArgumentException if service does not exist or is invalid
     */
    public static IService getService(String service) {
        if (service == null || service.trim().isEmpty()) {
            throw new IllegalArgumentException("Service name cannot be null or empty");
        }
        
        Class<?> serviceClass = null;
        Object serviceObject = null;
        try {
            serviceClass = Class.forName("org.example.Service" + service);
            serviceObject = serviceClass.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Service does not exist: " + service);
        }
        
        if (!(serviceObject instanceof IService)) {
            throw new IllegalArgumentException("Invalid service type");
        }
        
        return (IService) serviceObject;
    }
}

