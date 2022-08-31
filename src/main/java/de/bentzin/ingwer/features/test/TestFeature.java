package de.bentzin.ingwer.features.test;

import de.bentzin.ingwer.features.Feature;
import de.bentzin.ingwer.features.SimpleFeature;
import de.bentzin.ingwer.identity.permissions.IngwerPermission;

import javax.xml.stream.FactoryConfigurationError;

public class TestFeature extends SimpleFeature {
    public TestFeature() {
        super("test", "provides some test commands");
    }

    @Override
    public IngwerPermission generalUsePermission() {
        return IngwerPermission.USE;
    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    @Override
    public boolean onLoad() {
        return false;
    }
}
