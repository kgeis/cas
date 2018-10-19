
package org.apereo.cas;

import org.apereo.cas.adaptors.u2f.storage.U2FGroovyResourceDeviceRepositoryTests;
import org.apereo.cas.adaptors.u2f.storage.U2FInMemoryDeviceRepositoryTests;
import org.apereo.cas.adaptors.u2f.storage.U2FJsonResourceDeviceRepositoryTests;
import org.apereo.cas.adaptors.u2f.storage.U2FRestResourceDeviceRepositoryTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This is {@link AllTestsSuite}.
 *
 * @author Auto-generated by Gradle Build
 * @since 6.0.0-RC3
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    U2FRestResourceDeviceRepositoryTests.class,
    U2FGroovyResourceDeviceRepositoryTests.class,
    U2FJsonResourceDeviceRepositoryTests.class,
    U2FInMemoryDeviceRepositoryTests.class
})
public class AllTestsSuite {
}