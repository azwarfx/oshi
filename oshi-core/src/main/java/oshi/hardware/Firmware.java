/**
 * Oshi (https://github.com/dblock/oshi)
 *
 * Copyright (c) 2010 - 2017 The Oshi Project Team
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Maintainers:
 * dblock[at]dblock[dot]org
 * widdis[at]gmail[dot]com
 * enrico.bianchi[at]gmail[dot]com
 *
 * Contributors:
 * https://github.com/dblock/oshi/graphs/contributors
 */
package oshi.hardware;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * The Firmware represents the low level BIOS or equivalent
 * 
 * @author SchiTho1 [at] Securiton AG
 */
public interface Firmware extends Serializable {

    String getManufacturer();

    String getName();

    String getDescription();

    String getVersion();

    LocalDate getReleaseDate();
}