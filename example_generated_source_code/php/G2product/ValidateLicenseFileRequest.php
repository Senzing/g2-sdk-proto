<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: g2product.proto

namespace G2product;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>g2product.ValidateLicenseFileRequest</code>
 */
class ValidateLicenseFileRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string licenseFilePath = 1;</code>
     */
    protected $licenseFilePath = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $licenseFilePath
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\G2Product::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string licenseFilePath = 1;</code>
     * @return string
     */
    public function getLicenseFilePath()
    {
        return $this->licenseFilePath;
    }

    /**
     * Generated from protobuf field <code>string licenseFilePath = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setLicenseFilePath($var)
    {
        GPBUtil::checkString($var, True);
        $this->licenseFilePath = $var;

        return $this;
    }

}

